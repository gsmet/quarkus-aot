package fr.spacefox.perftests.quarkus.rest.endpoint314;

import fr.spacefox.perftests.quarkus.core.service314.model.Model314;
import fr.spacefox.perftests.quarkus.rest.endpoint314.schema.Schema314;

final class Mapper {
    private Mapper() {}

    public static Schema314 of(Model314 model) {
        return new Schema314(model.id(), model.value());
    }
}
