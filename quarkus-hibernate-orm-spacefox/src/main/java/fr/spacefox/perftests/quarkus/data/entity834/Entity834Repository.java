package fr.spacefox.perftests.quarkus.data.entity834;

import fr.spacefox.perftests.quarkus.core.port.data.Entity834DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service834.model.Model834;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity834Repository implements Entity834DatasourcePort, PanacheRepository<Entity834> {
    @Override
    public Optional<Model834> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
