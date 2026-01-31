package fr.spacefox.perftests.quarkus.rest.endpoint858;

import fr.spacefox.perftests.quarkus.core.service858.model.Model858;
import fr.spacefox.perftests.quarkus.rest.endpoint858.schema.Schema858;

final class Mapper {
    private Mapper() {}

    public static Schema858 of(Model858 model) {
        return new Schema858(model.id(), model.value());
    }
}
