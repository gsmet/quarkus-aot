package fr.spacefox.perftests.quarkus.core.service326;

import fr.spacefox.perftests.quarkus.core.port.data.Entity326DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service326.model.Model326;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@RunOnVirtualThread
public class Service326 {

    private final Entity326DatasourcePort datasource;

    public Service326(Entity326DatasourcePort datasource) {
        this.datasource = datasource;
    }

    public Model326 compute(Long id) {
        return datasource.find(id).orElseThrow();
    }
}
