package fr.spacefox.perftests.quarkus.core.service383;

import fr.spacefox.perftests.quarkus.core.port.data.Entity383DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service383.model.Model383;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service383 {

    private final Entity383DatasourcePort datasource;

    public Service383(Entity383DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model383 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
