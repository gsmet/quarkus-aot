package fr.spacefox.perftests.quarkus.rest.endpoint789;

import fr.spacefox.perftests.quarkus.core.service789.model.Model789;
import fr.spacefox.perftests.quarkus.rest.endpoint789.schema.Schema789;

final class Mapper {
    private Mapper() {}

    public static Schema789 of(Model789 model) {
        return new Schema789(model.id(), model.value());
    }
}
