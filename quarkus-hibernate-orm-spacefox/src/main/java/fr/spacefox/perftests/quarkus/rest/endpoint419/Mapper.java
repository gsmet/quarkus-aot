package fr.spacefox.perftests.quarkus.rest.endpoint419;

import fr.spacefox.perftests.quarkus.core.service419.model.Model419;
import fr.spacefox.perftests.quarkus.rest.endpoint419.schema.Schema419;

final class Mapper {
    private Mapper() {}

    public static Schema419 of(Model419 model) {
        return new Schema419(model.id(), model.value());
    }
}
