package fr.spacefox.perftests.quarkus.rest.endpoint2;

import fr.spacefox.perftests.quarkus.core.service2.model.Model2;
import fr.spacefox.perftests.quarkus.rest.endpoint2.schema.Schema2;

final class Mapper {
    private Mapper() {}

    public static Schema2 of(Model2 model) {
        return new Schema2(model.id(), model.value());
    }
}
