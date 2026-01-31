package fr.spacefox.perftests.quarkus.rest.endpoint831;

import fr.spacefox.perftests.quarkus.core.service831.model.Model831;
import fr.spacefox.perftests.quarkus.rest.endpoint831.schema.Schema831;

final class Mapper {
    private Mapper() {}

    public static Schema831 of(Model831 model) {
        return new Schema831(model.id(), model.value());
    }
}
