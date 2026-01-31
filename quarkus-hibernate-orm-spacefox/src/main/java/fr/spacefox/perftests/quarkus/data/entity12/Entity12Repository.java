package fr.spacefox.perftests.quarkus.data.entity12;

import fr.spacefox.perftests.quarkus.core.port.data.Entity12DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service12.model.Model12;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity12Repository implements Entity12DatasourcePort, PanacheRepository<Entity12> {
    @Override
    public Optional<Model12> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
