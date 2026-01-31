package fr.spacefox.perftests.quarkus.data.entity714;

import fr.spacefox.perftests.quarkus.core.service714.model.Model714;

final class Mapper {
    private Mapper() {}

    public static Model714 of(Entity714 entity) {
        return new Model714(entity.getId(), entity.getField());
    }
}
