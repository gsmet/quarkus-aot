package fr.spacefox.perftests.quarkus.rest.endpoint628;

import fr.spacefox.perftests.quarkus.core.service628.model.Model628;
import fr.spacefox.perftests.quarkus.rest.endpoint628.schema.Schema628;

final class Mapper {
    private Mapper() {}

    public static Schema628 of(Model628 model) {
        return new Schema628(model.id(), model.value());
    }
}
