package fr.spacefox.perftests.quarkus.data.entity763;

import fr.spacefox.perftests.quarkus.core.port.data.Entity763DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service763.model.Model763;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity763Repository implements Entity763DatasourcePort, PanacheRepository<Entity763> {
    @Override
    public Optional<Model763> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
