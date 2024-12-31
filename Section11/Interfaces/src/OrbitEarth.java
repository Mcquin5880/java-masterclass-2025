import java.util.Date;

interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
    }

    private static void log(String description) {
        var today = new Date();
        System.out.println(today + ": " + description);
    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}
