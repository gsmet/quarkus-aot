package fr.spacefox.perftests.quarkus.rest.endpoint572;

import fr.spacefox.perftests.quarkus.core.service572.model.Model572;
import fr.spacefox.perftests.quarkus.rest.endpoint572.schema.Schema572;

final class Mapper {
    private Mapper() {}

    public static Schema572 of(Model572 model) {
        return new Schema572(model.id(), model.value());
    }
}
