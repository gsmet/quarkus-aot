package fr.spacefox.perftests.quarkus.data.entity259;

import fr.spacefox.perftests.quarkus.core.port.data.Entity259DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service259.model.Model259;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity259Repository implements Entity259DatasourcePort, PanacheRepository<Entity259> {
    @Override
    public Optional<Model259> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
