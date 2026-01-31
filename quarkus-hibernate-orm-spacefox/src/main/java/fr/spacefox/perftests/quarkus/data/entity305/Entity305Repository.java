package fr.spacefox.perftests.quarkus.data.entity305;

import fr.spacefox.perftests.quarkus.core.port.data.Entity305DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service305.model.Model305;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity305Repository implements Entity305DatasourcePort, PanacheRepository<Entity305> {
    @Override
    public Optional<Model305> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
