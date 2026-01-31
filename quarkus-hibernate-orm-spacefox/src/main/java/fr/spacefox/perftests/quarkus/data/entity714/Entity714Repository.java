package fr.spacefox.perftests.quarkus.data.entity714;

import fr.spacefox.perftests.quarkus.core.port.data.Entity714DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service714.model.Model714;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity714Repository implements Entity714DatasourcePort, PanacheRepository<Entity714> {
    @Override
    public Optional<Model714> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
