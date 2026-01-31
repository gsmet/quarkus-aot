package fr.spacefox.perftests.quarkus.data.entity604;

import fr.spacefox.perftests.quarkus.core.port.data.Entity604DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service604.model.Model604;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity604Repository implements Entity604DatasourcePort, PanacheRepository<Entity604> {
    @Override
    public Optional<Model604> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
