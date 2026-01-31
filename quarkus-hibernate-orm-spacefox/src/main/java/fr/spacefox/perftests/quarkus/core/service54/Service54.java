package fr.spacefox.perftests.quarkus.core.service54;

import fr.spacefox.perftests.quarkus.core.port.data.Entity54DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service54.model.Model54;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service54 {

    private final Entity54DatasourcePort datasource;

    public Service54(Entity54DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model54 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
