package fr.spacefox.perftests.quarkus.data.entity144;

import fr.spacefox.perftests.quarkus.core.service144.model.Model144;

final class Mapper {
    private Mapper() {}

    public static Model144 of(Entity144 entity) {
        return new Model144(entity.getId(), entity.getField());
    }
}
