package fr.spacefox.perftests.quarkus.rest.endpoint567;

import fr.spacefox.perftests.quarkus.core.service567.model.Model567;
import fr.spacefox.perftests.quarkus.rest.endpoint567.schema.Schema567;

final class Mapper {
    private Mapper() {}

    public static Schema567 of(Model567 model) {
        return new Schema567(model.id(), model.value());
    }
}
