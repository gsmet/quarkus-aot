package fr.spacefox.perftests.quarkus.data.entity326;

import fr.spacefox.perftests.quarkus.core.service326.model.Model326;

final class Mapper {
    private Mapper() {}

    public static Model326 of(Entity326 entity) {
        return new Model326(entity.getId(), entity.getField());
    }
}
