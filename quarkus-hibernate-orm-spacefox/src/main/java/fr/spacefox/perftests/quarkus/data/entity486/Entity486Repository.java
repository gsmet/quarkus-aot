package fr.spacefox.perftests.quarkus.data.entity486;

import fr.spacefox.perftests.quarkus.core.port.data.Entity486DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service486.model.Model486;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity486Repository implements Entity486DatasourcePort, PanacheRepository<Entity486> {
    @Override
    public Optional<Model486> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
