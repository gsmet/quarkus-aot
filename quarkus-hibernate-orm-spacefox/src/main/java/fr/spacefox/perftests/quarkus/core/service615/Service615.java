package fr.spacefox.perftests.quarkus.core.service615;

import fr.spacefox.perftests.quarkus.core.port.data.Entity615DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service615.model.Model615;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service615 {

    private final Entity615DatasourcePort datasource;

    public Service615(Entity615DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model615 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
