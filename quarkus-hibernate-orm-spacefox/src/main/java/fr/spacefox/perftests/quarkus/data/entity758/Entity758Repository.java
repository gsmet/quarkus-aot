package fr.spacefox.perftests.quarkus.data.entity758;

import fr.spacefox.perftests.quarkus.core.port.data.Entity758DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service758.model.Model758;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity758Repository implements Entity758DatasourcePort, PanacheRepository<Entity758> {
    @Override
    public Optional<Model758> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
