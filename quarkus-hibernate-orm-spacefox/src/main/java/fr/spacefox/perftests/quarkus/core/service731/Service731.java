package fr.spacefox.perftests.quarkus.core.service731;

import fr.spacefox.perftests.quarkus.core.port.data.Entity731DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service731.model.Model731;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service731 {

    private final Entity731DatasourcePort datasource;

    public Service731(Entity731DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model731 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
