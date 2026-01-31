package fr.spacefox.perftests.quarkus.data.entity468;

import fr.spacefox.perftests.quarkus.core.port.data.Entity468DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service468.model.Model468;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity468Repository implements Entity468DatasourcePort, PanacheRepository<Entity468> {
    @Override
    public Optional<Model468> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
