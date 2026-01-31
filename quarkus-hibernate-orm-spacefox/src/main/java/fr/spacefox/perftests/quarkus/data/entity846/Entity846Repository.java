package fr.spacefox.perftests.quarkus.data.entity846;

import fr.spacefox.perftests.quarkus.core.port.data.Entity846DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service846.model.Model846;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity846Repository implements Entity846DatasourcePort, PanacheRepository<Entity846> {
    @Override
    public Optional<Model846> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
