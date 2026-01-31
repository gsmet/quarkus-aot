package fr.spacefox.perftests.quarkus.data.entity746;

import fr.spacefox.perftests.quarkus.core.port.data.Entity746DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service746.model.Model746;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity746Repository implements Entity746DatasourcePort, PanacheRepository<Entity746> {
    @Override
    public Optional<Model746> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
