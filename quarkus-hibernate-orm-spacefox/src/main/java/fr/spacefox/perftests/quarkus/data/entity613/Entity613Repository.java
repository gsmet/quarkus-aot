package fr.spacefox.perftests.quarkus.data.entity613;

import fr.spacefox.perftests.quarkus.core.port.data.Entity613DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service613.model.Model613;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity613Repository implements Entity613DatasourcePort, PanacheRepository<Entity613> {
    @Override
    public Optional<Model613> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
