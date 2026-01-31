package fr.spacefox.perftests.quarkus.data.entity244;

import fr.spacefox.perftests.quarkus.core.port.data.Entity244DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service244.model.Model244;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity244Repository implements Entity244DatasourcePort, PanacheRepository<Entity244> {
    @Override
    public Optional<Model244> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
