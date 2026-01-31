package fr.spacefox.perftests.quarkus.rest.endpoint354;

import fr.spacefox.perftests.quarkus.core.service354.model.Model354;
import fr.spacefox.perftests.quarkus.rest.endpoint354.schema.Schema354;

final class Mapper {
    private Mapper() {}

    public static Schema354 of(Model354 model) {
        return new Schema354(model.id(), model.value());
    }
}
