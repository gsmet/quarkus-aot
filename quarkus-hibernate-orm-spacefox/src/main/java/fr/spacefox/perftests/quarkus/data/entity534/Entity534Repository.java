package fr.spacefox.perftests.quarkus.data.entity534;

import fr.spacefox.perftests.quarkus.core.port.data.Entity534DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service534.model.Model534;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity534Repository implements Entity534DatasourcePort, PanacheRepository<Entity534> {
    @Override
    public Optional<Model534> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
