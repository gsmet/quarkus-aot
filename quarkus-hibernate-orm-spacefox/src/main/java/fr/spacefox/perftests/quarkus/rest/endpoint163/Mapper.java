package fr.spacefox.perftests.quarkus.rest.endpoint163;

import fr.spacefox.perftests.quarkus.core.service163.model.Model163;
import fr.spacefox.perftests.quarkus.rest.endpoint163.schema.Schema163;

final class Mapper {
    private Mapper() {}

    public static Schema163 of(Model163 model) {
        return new Schema163(model.id(), model.value());
    }
}
