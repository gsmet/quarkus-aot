package fr.spacefox.perftests.quarkus.rest.endpoint768;

import fr.spacefox.perftests.quarkus.core.service768.model.Model768;
import fr.spacefox.perftests.quarkus.rest.endpoint768.schema.Schema768;

final class Mapper {
    private Mapper() {}

    public static Schema768 of(Model768 model) {
        return new Schema768(model.id(), model.value());
    }
}
