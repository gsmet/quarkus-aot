package fr.spacefox.perftests.quarkus.rest.endpoint697;

import fr.spacefox.perftests.quarkus.core.service697.model.Model697;
import fr.spacefox.perftests.quarkus.rest.endpoint697.schema.Schema697;

final class Mapper {
    private Mapper() {}

    public static Schema697 of(Model697 model) {
        return new Schema697(model.id(), model.value());
    }
}
