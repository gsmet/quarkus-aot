package fr.spacefox.perftests.quarkus.rest.endpoint324;

import fr.spacefox.perftests.quarkus.core.service324.model.Model324;
import fr.spacefox.perftests.quarkus.rest.endpoint324.schema.Schema324;

final class Mapper {
    private Mapper() {}

    public static Schema324 of(Model324 model) {
        return new Schema324(model.id(), model.value());
    }
}
