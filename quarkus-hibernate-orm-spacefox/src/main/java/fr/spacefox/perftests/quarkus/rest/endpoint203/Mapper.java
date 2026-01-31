package fr.spacefox.perftests.quarkus.rest.endpoint203;

import fr.spacefox.perftests.quarkus.core.service203.model.Model203;
import fr.spacefox.perftests.quarkus.rest.endpoint203.schema.Schema203;

final class Mapper {
    private Mapper() {}

    public static Schema203 of(Model203 model) {
        return new Schema203(model.id(), model.value());
    }
}
