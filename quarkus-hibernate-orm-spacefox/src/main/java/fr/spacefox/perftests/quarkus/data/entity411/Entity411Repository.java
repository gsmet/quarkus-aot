package fr.spacefox.perftests.quarkus.data.entity411;

import fr.spacefox.perftests.quarkus.core.port.data.Entity411DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service411.model.Model411;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity411Repository implements Entity411DatasourcePort, PanacheRepository<Entity411> {
    @Override
    public Optional<Model411> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
