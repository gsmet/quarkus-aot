package fr.spacefox.perftests.quarkus.data.entity756;

import fr.spacefox.perftests.quarkus.core.port.data.Entity756DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service756.model.Model756;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity756Repository implements Entity756DatasourcePort, PanacheRepository<Entity756> {
    @Override
    public Optional<Model756> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
