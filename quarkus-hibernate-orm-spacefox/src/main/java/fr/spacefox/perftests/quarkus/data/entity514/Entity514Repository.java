package fr.spacefox.perftests.quarkus.data.entity514;

import fr.spacefox.perftests.quarkus.core.port.data.Entity514DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service514.model.Model514;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity514Repository implements Entity514DatasourcePort, PanacheRepository<Entity514> {
    @Override
    public Optional<Model514> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
