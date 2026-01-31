package fr.spacefox.perftests.quarkus.rest.endpoint576;

import fr.spacefox.perftests.quarkus.core.service576.model.Model576;
import fr.spacefox.perftests.quarkus.rest.endpoint576.schema.Schema576;

final class Mapper {
    private Mapper() {}

    public static Schema576 of(Model576 model) {
        return new Schema576(model.id(), model.value());
    }
}
