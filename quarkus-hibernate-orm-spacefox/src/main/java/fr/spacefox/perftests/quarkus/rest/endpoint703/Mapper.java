package fr.spacefox.perftests.quarkus.rest.endpoint703;

import fr.spacefox.perftests.quarkus.core.service703.model.Model703;
import fr.spacefox.perftests.quarkus.rest.endpoint703.schema.Schema703;

final class Mapper {
    private Mapper() {}

    public static Schema703 of(Model703 model) {
        return new Schema703(model.id(), model.value());
    }
}
