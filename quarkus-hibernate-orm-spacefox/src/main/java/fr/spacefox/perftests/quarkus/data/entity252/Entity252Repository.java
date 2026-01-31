package fr.spacefox.perftests.quarkus.data.entity252;

import fr.spacefox.perftests.quarkus.core.port.data.Entity252DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service252.model.Model252;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity252Repository implements Entity252DatasourcePort, PanacheRepository<Entity252> {
    @Override
    public Optional<Model252> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
