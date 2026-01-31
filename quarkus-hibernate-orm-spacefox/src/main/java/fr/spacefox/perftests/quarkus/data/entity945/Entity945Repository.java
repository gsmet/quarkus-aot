package fr.spacefox.perftests.quarkus.data.entity945;

import fr.spacefox.perftests.quarkus.core.port.data.Entity945DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service945.model.Model945;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity945Repository implements Entity945DatasourcePort, PanacheRepository<Entity945> {
    @Override
    public Optional<Model945> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
