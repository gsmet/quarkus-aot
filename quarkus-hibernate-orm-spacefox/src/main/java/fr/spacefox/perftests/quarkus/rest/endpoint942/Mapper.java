package fr.spacefox.perftests.quarkus.rest.endpoint942;

import fr.spacefox.perftests.quarkus.core.service942.model.Model942;
import fr.spacefox.perftests.quarkus.rest.endpoint942.schema.Schema942;

final class Mapper {
    private Mapper() {}

    public static Schema942 of(Model942 model) {
        return new Schema942(model.id(), model.value());
    }
}
