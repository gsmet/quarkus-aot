package fr.spacefox.perftests.quarkus.rest.endpoint586;

import fr.spacefox.perftests.quarkus.core.service586.model.Model586;
import fr.spacefox.perftests.quarkus.rest.endpoint586.schema.Schema586;

final class Mapper {
    private Mapper() {}

    public static Schema586 of(Model586 model) {
        return new Schema586(model.id(), model.value());
    }
}
