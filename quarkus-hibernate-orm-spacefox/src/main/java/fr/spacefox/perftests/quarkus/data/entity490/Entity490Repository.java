package fr.spacefox.perftests.quarkus.data.entity490;

import fr.spacefox.perftests.quarkus.core.port.data.Entity490DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service490.model.Model490;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity490Repository implements Entity490DatasourcePort, PanacheRepository<Entity490> {
    @Override
    public Optional<Model490> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
