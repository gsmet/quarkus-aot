package fr.spacefox.perftests.quarkus.rest.endpoint675;

import fr.spacefox.perftests.quarkus.core.service675.model.Model675;
import fr.spacefox.perftests.quarkus.rest.endpoint675.schema.Schema675;

final class Mapper {
    private Mapper() {}

    public static Schema675 of(Model675 model) {
        return new Schema675(model.id(), model.value());
    }
}
