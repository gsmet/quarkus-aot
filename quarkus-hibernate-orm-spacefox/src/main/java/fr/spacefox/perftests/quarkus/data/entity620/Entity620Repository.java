package fr.spacefox.perftests.quarkus.data.entity620;

import fr.spacefox.perftests.quarkus.core.port.data.Entity620DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service620.model.Model620;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity620Repository implements Entity620DatasourcePort, PanacheRepository<Entity620> {
    @Override
    public Optional<Model620> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
