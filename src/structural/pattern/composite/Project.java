package structural.pattern.composite;

public enum Project {
    ANYWHEREWORKS {
        @Override
        String getProjectDetail() {
            return "Project Anywhwerworks";
        }
    }, YOCOBORD {
        @Override
        String getProjectDetail() {
            return "Project YoCoBoard";
        }
    }, SETMORE {
        @Override
        String getProjectDetail() {
            return "Project Setmore";
        }
    }, TELEPORT {
        @Override
        String getProjectDetail() {
            return "Project TelePort";
        }
    };

    abstract String getProjectDetail();
}
