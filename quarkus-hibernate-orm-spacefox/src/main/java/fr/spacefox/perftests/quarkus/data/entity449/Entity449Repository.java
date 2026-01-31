package fr.spacefox.perftests.quarkus.data.entity449;

import fr.spacefox.perftests.quarkus.core.port.data.Entity449DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service449.model.Model449;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity449Repository implements Entity449DatasourcePort, PanacheRepository<Entity449> {
    @Override
    public Optional<Model449> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
