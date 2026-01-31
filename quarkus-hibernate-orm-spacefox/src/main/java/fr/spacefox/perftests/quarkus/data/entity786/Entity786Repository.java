package fr.spacefox.perftests.quarkus.data.entity786;

import fr.spacefox.perftests.quarkus.core.port.data.Entity786DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service786.model.Model786;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity786Repository implements Entity786DatasourcePort, PanacheRepository<Entity786> {
    @Override
    public Optional<Model786> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
