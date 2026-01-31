package fr.spacefox.perftests.quarkus.rest.endpoint666;

import fr.spacefox.perftests.quarkus.core.service666.model.Model666;
import fr.spacefox.perftests.quarkus.rest.endpoint666.schema.Schema666;

final class Mapper {
    private Mapper() {}

    public static Schema666 of(Model666 model) {
        return new Schema666(model.id(), model.value());
    }
}
